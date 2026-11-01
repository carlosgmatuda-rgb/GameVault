package campoMinado.campo;

import campoMinado.Tabuleiro.PersonagemModel;
import campoMinado.Tabuleiro.Posicao;
import campoMinado.Tabuleiro.Tabuleiro;

import java.awt.*;

public class CampoPersonagem extends PersonagemModel {
    private Color color;

    public CampoPersonagem(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
