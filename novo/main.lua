require "J2MESprite"
w = require "w"
ab = require "ab"

function love.load()
    love.window.setMode(240, 320, {resizable = false})
    love.graphics.setDefaultFilter("nearest", "nearest")
    
    w:init()
    ab:init(w)
    ab:a()
end

function love.update(dt)
    ab:update(dt)
end

function love.draw()
    ab:draw()
end

function love.keypressed(key)
    local code = w:map_key(key)
    w:KEYPRESSED(code)
end

function love.keyreleased(key)
    w:KEYPRESSED(0)
end