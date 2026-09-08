local y = {}
y.__index = y

function y.new() return setmetatable({}, y) end

function y:a(nArray)
    local success, message = pcall(function()
        local data = ""
        for i = 1, #nArray do
            data = data .. tostring(nArray[i]) .. "\n"
        end
        love.filesystem.write("save.txt", data)
    end)
end

function y:int_arr_a()
    if not love.filesystem.getInfo("save.txt") then return {7, 0, 50000, 0, 200, 1, 1, 0} end
    local content = love.filesystem.read("save.txt")
    local arr = {}
    for line in content:gmatch("[^\r\n]+") do
        table.insert(arr, tonumber(line) or 0)
    end
    if #arr == 0 then return {7, 0, 50000, 0, 200, 1, 1, 0} end
    return arr
end

function y.boolean_a(filename)
    return love.filesystem.getInfo(filename .. ".txt") ~= nil
end

return y