package one.DigitalInovattion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Mensagem {
    LocalDateTime agora = LocalDateTime.now();
    DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH");

    private Integer getHoraFormatada() {
        int horaFormatada = Integer.parseInt(formatterHora.format(agora));
        return horaFormatada;
    }

    private String getMensagem(int hora) {
        String mensagemHora;
        hora = this.getHoraFormatada();

        if (hora > 6 && hora < 11) {
            mensagemHora = "bom dia!";
        } else if (hora >= 12 && hora <= 17) {
            mensagemHora = "boa tarde!";
        } else if (hora >= 18 && hora <= 23) {
            mensagemHora = "boa noite!";
        }else{
            mensagemHora = "Boa madrugada!";
        }
        return mensagemHora;
    }

    public String mensagem(){
        return this.getMensagem(getHoraFormatada());
    }

}
