local af = {}
af.__index = af
function af:new(w, g) return setmetatable({}, af) end
function af:a() end
return af