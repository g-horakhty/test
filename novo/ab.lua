local k = require "k"
local v = require "v"
local af = require "af"
local aj = require "aj"
local aa = require "aa"
local al = require "al"

local ab = {
    var_boolean_a = false,
    var_int_a = 4, -- Inicia direto no jogo ou tela de título (4 = aj / jogo principal)
    current_state = nil,
    var_w_a = nil
}

function ab:init(w_ref)
    self.var_w_a = w_ref
    if self.var_boolean_a then
        ab.var_int_a = 4
    end
end

function ab:a()
    self.var_boolean_a = false
    self:b()
end

function ab:b()
    if self.var_int_a == 0 then
        self.current_state = af:new(self.var_w_a)
    elseif self.var_int_a == 1 then
        self.current_state = v:new(self.var_w_a)
    elseif self.var_int_a == 3 then
        self.current_state = k:new(self.var_w_a)
    elseif self.var_int_a == 4 then
        self.current_state = aj:new(self.var_w_a, false)
    elseif self.var_int_a == 5 then
        self.current_state = aj:new(self.var_w_a, true)
    end
end

function ab:update(dt)
    if self.current_state and self.current_state.update then
        self.current_state:update(dt)
    end
end

function ab:draw()
    love.graphics.clear(0,0,0)
    if self.current_state and self.current_state.draw then
        self.current_state:draw()
    end
end

return ab