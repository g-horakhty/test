local aa = {}
aa.__index = aa
function aa:new(w, g, sound) return setmetatable({}, aa) end
function aa:a() end
return aa