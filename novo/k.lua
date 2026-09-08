local k = {}
k.__index = k

function k:new(w_ref)
    local this = {
        var_w_a = w_ref,
        var_boolean_a = true,
        var_boolean_b = false,
        var_int_a = 0,
        var_javax_microedition_lcdui_game_Sprite_a = J2MESprite:new("title.png"),
        var_javax_microedition_lcdui_game_Sprite_b = J2MESprite:new("menu_1.png", 100, 30),
        c = J2MESprite:new("menu_2.png", 100, 30),
        d = J2MESprite:new("point.png")
    }
    local tw, th = this.var_javax_microedition_lcdui_game_Sprite_a:getWidth(), this.var_javax_microedition_lcdui_game_Sprite_a:getHeight()
    this.var_javax_microedition_lcdui_game_Sprite_a:setPosition((w_ref.var_int_c - tw)/2, (w_ref.var_int_d - th)/2)
    setmetatable(this, k)
    return this
end

function k:update(dt)
    if self.var_boolean_b then return end
    local kstate = self.var_w_a:getKeyStates()
    
    if self.var_boolean_a then
        if kstate == -1 or kstate == 50 then
            self.var_int_a = self.var_int_a - 1
            if self.var_int_a < 0 then self.var_int_a = 4 end
            self.var_w_a.var_int_a = 0
        elseif kstate == -2 or kstate == 56 then
            self.var_int_a = self.var_int_a + 1
            if self.var_int_a > 4 then self.var_int_a = 0 end
            self.var_w_a.var_int_a = 0
        elseif kstate == -5 or kstate == 53 then
            if self.var_int_a == 0 then
                self.var_boolean_b = true
                ab.var_int_a = 4
                ab:b()
            elseif self.var_int_a == 1 then
                self.var_boolean_b = true
                ab.var_int_a = 5
                ab:b()
            end
            self.var_w_a.var_int_a = 0
        end
    end
end

function k:draw()
    love.graphics.clear(0,0,0)
    self.var_javax_microedition_lcdui_game_Sprite_a:paint()
    if self.var_boolean_a then
        for i = 0, 4 do
            local spr = self.var_javax_microedition_lcdui_game_Sprite_b
            spr:setFrame(i == self.var_int_a and (i*2+1) or (i*2))
            spr:setPosition(
                self.var_javax_microedition_lcdui_game_Sprite_a:getX() + (240 - spr:getWidth())/2,
                self.var_javax_microedition_lcdui_game_Sprite_a:getY() + 148 + i * spr:getHeight()
            )
            spr:paint()
            if i == self.var_int_a then
                self.d:setPosition(spr:getX() - 17, spr:getY() - 4)
            end
        end
    end
    self.d:paint()
end

return k