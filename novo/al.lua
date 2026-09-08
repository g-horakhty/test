local al = {}
al.__index = al
function al:new(w, g) return setmetatable({}, al) end
function al:a() end
return al