J2MESprite = {}
J2MESprite.__index = J2MESprite

function J2MESprite:new(image_path, frame_width, frame_height)
    local ok, img = pcall(love.graphics.newImage, image_path)
    if not ok then
        -- Cria uma imagem placeholder caso o asset não exista no diretório
        local imgData = love.image.newImageData(16, 16)
        imgData:mapPixel(function(x,y) return 255, 0, 255, 255 end)
        img = love.graphics.newImage(imgData)
    end

    local this = {
        image = img,
        x = 0,
        y = 0,
        current_frame = 1,
        quads = {}
    }
    
    local w = this.image:getWidth()
    local h = this.image:getHeight()
    this.frame_width = frame_width or w
    this.frame_height = frame_height or h
    
    local cols = math.max(1, math.floor(w / this.frame_width))
    local rows = math.max(1, math.floor(h / this.frame_height))
    
    for r = 0, rows - 1 do
        for c = 0, cols - 1 do
            table.insert(this.quads, love.graphics.newQuad(
                c * this.frame_width, r * this.frame_height, 
                this.frame_width, this.frame_height, w, h
            ))
        end
    end
    
    setmetatable(this, J2MESprite)
    return this
end

function J2MESprite:setFrame(f)
    self.current_frame = (f or 0) + 1
    if self.current_frame > #self.quads then self.current_frame = 1 end
    if self.current_frame < 1 then self.current_frame = 1 end
end

function J2MESprite:setPosition(x, y) self.x = x; self.y = y end
function J2MESprite:move(dx, dy) self.x = self.x + dx; self.y = self.y + dy end
function J2MESprite:getWidth() return self.frame_width end
function J2MESprite:getHeight() return self.frame_height end
function J2MESprite:getX() return self.x end
function J2MESprite:getY() return self.y end

function J2MESprite:paint(graphics)
    if self.quads[self.current_frame] then
        love.graphics.draw(self.image, self.quads[self.current_frame], self.x, self.y)
    end
end