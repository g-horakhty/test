local v = {}
v.__index = v
function v:new(w, g) return setmetatable({}, v) end
function v:update(dt) ab.var_int_a = 3; ab:b() end
function v:draw() end
return v