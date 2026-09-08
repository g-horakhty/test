local g = {}
g.__index = g

function g.new(path, type_str)
    local this = {
        var_boolean_a = false,
        source = nil
    }
    pcall(function()
        this.source = love.audio.newSource(path, "stream")
    end)
    setmetatable(this, g)
    return this
end

function g:a(n2)
    if self.source then
        if self.var_boolean_a then
            self.source:setLooping(true)
        end
        self.source:play()
    end
    return true
end

function g:a_stop()
    if self.source then self.source:stop() end
    return true
end

function g:b(n2)
    if self.source and n2 >= 0 and n2 <= 100 then
        self.source:setVolume(n2 / 100)
        return true
    end
    return false
end

return g