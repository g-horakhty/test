local aj = {}
aj.__index = aj

function aj:new(w_ref, load_save)
    local this = {
        var_w_a = w_ref,
        var_boolean_a = true,
        var_boolean_d = false,
        var_int_e = 200,
        var_int_f = 0,
        var_short_a = 0,
        var_int_g = 50000,
        var_byte_h = 1,
        var_byte_g = 1,
        var_byte_i = 0,
        var_short_b = 0,
        var_java_util_Vector_a = {},
        
        -- Sprites do cenário e interface mantidos
        var_javax_microedition_lcdui_game_Sprite_a = J2MESprite:new("background.png"),
        var_javax_microedition_lcdui_game_Sprite_b = J2MESprite:new("house.png"),
        var_javax_microedition_lcdui_game_Sprite_c = J2MESprite:new("doghouse.png"),
        var_javax_microedition_lcdui_game_Sprite_d = J2MESprite:new("farmland.png", 30, 30),
        var_javax_microedition_lcdui_game_Sprite_e = J2MESprite:new("placard.png"),
        var_javax_microedition_lcdui_game_Sprite_f = J2MESprite:new("bug.png", 20, 20),
        var_javax_microedition_lcdui_game_Sprite_g = J2MESprite:new("grass.png"),
        var_javax_microedition_lcdui_game_Sprite_h = J2MESprite:new("badTip.png", 20, 20),
        var_javax_microedition_lcdui_game_Sprite_i = J2MESprite:new("underWhite.png"),
        var_javax_microedition_lcdui_game_Sprite_j = J2MESprite:new("expWord.png"),
        var_javax_microedition_lcdui_game_Sprite_k = J2MESprite:new("expBarWhite.png"),
        var_javax_microedition_lcdui_game_Sprite_l = J2MESprite:new("expBarBlue.png", 10, 10),
        var_javax_microedition_lcdui_game_Sprite_m = J2MESprite:new("expNumber.png", 10, 10),
        n = J2MESprite:new("levelIcon.png"),
        o = J2MESprite:new("levelNumber.png", 10, 10),
        p = J2MESprite:new("moneyIcon.png"),
        q = J2MESprite:new("moneyNumber.png", 10, 10),
        r = J2MESprite:new("addExpNum.png", 10, 10),
        s = J2MESprite:new("dayWord.png"),
        t = J2MESprite:new("dayNum.png", 10, 10),
        u = J2MESprite:new("iconWord.png", 20, 20),
        v = J2MESprite:new("back.png", 30, 30),
        I = J2MESprite:new("gift.png"),
        J = J2MESprite:new("feed.png", 30, 30)
    }
    
    this.var_int_a = (w_ref.var_int_c - this.var_javax_microedition_lcdui_game_Sprite_a:getWidth()) / 2
    this.var_int_b = (w_ref.var_int_d - this.var_javax_microedition_lcdui_game_Sprite_a:getHeight()) / 2
    
    setmetatable(this, aj)
    return this
end

function aj:update(dt)
    if self.var_boolean_d then return end
    
    -- Movimentação por teclado básico
    local kstate = self.var_w_a:getKeyStates()
    if kstate == -3 then
        self.var_short_b = (self.var_short_b - 1) % 8
        self.var_w_a.var_int_a = 0
    elseif kstate == -4 then
        self.var_short_b = (self.var_short_b + 1) % 8
        self.var_w_a.var_int_a = 0
    elseif kstate == -6 then
        ab.var_int_a = 3
        ab:b()
    end
end

function aj:draw()
    love.graphics.clear(0, 0, 0)
    
    -- Desenho do fundo e construções
    self.var_javax_microedition_lcdui_game_Sprite_a:setPosition(self.var_int_a, self.var_int_b)
    self.var_javax_microedition_lcdui_game_Sprite_a:paint()
    
    self.var_javax_microedition_lcdui_game_Sprite_b:setPosition(self.var_int_a + 142, self.var_int_b + 10)
    self.var_javax_microedition_lcdui_game_Sprite_b:paint()
    
    self.var_javax_microedition_lcdui_game_Sprite_c:setPosition(self.var_int_a + 78, self.var_int_b + 62)
    self.var_javax_microedition_lcdui_game_Sprite_c:paint()
    
    -- Painel superior de status (XP, Dinheiro, Data)
    self.var_javax_microedition_lcdui_game_Sprite_i:setPosition(5, 15)
    self.var_javax_microedition_lcdui_game_Sprite_i:paint()
    
    self.var_javax_microedition_lcdui_game_Sprite_j:setPosition(8, 20)
    self.var_javax_microedition_lcdui_game_Sprite_j:paint()
    
    self.var_javax_microedition_lcdui_game_Sprite_k:setPosition(47, 21)
    self.var_javax_microedition_lcdui_game_Sprite_k:paint()
    
    -- Ícone de Dinheiro
    self.p:setPosition(11, 38)
    self.p:paint()
    
    -- Ícones de Navegação Inferior
    self.v:setPosition(0, self.var_w_a.var_int_d - 40)
    self.v:setFrame(0)
    self.v:paint()
    
    self.v:setPosition(self.var_w_a.var_int_c - 30, self.var_w_a.var_int_d - 40)
    self.v:setFrame(1)
    self.v:paint()

    if self.var_boolean_a then
        self.I:setPosition((240 - self.I:getWidth())/2, (320 - self.I:getHeight())/2)
        self.I:paint()
    end
end

return aj