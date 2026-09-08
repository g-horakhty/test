local w = {
    var_int_c = 240,
    var_int_d = 320,
    var_int_a = 0,
    var_boolean_a = false,
    var_boolean_b = false,
    var_byte_a = 7,
    var_g_a = nil,
    var_short_arr_a = {120, 240, 360, 300, 360, 360, 360, 420, 540, 540, 840, 900, 480, 480, 540, 300},
    var_byte_arr_g = {40, 40, 120, 50},
    var_byte_arr_e = {50, 54, 1, 40},
    var_byte_arr_h = {10, 15, 0, 10},
    var_byte_arr_c = {36, 42, 54, 35, 39, 36, 31, 28, 30, 33, 34, 30, 40, 48, 46, 47}
}

function w:init()
    self.var_int_c = love.graphics.getWidth()
    self.var_int_d = love.graphics.getHeight()
end

function w:setFullScreenMode(b) end
function w:flushGraphics() end
function w:int_a() return 100 end
function w:a(n) end

function w:getKeyStates()
    local val = self.var_int_a
    return val
end

function w:KEYPRESSED(n)
    self.var_int_a = n
end

function w:map_key(key)
    if key == "up" then return -1 end
    if key == "down" then return -2 end
    if key == "left" then return -3 end
    if key == "right" then return -4 end
    if key == "return" or key == "z" then return -5 end
    if key == "escape" or key == "x" then return -6 end
    if key == "backspace" then return -7 end
    if key == "1" then return 49 end
    if key == "2" then return 50 end
    if key == "3" then return 51 end
    if key == "4" then return 52 end
    if key == "5" then return 53 end
    if key == "6" then return 54 end
    if key == "7" then return 55 end
    if key == "8" then return 56 end
    return 0
end

return w