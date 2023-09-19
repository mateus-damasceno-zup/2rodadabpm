package bpm2.src;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
/* ======================================================================================================================== */
// Desafio 2
// Conversão de Tempo

/*
Você terá o desafio de ler um valor inteiro, faça a conversão desse valor para date e informe-o expresso no formato
dia/mês/ano horas:minutos:segundos.

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.

- Obs

Utilize UTC (GMT-0)

- Exemplo:
    Entrada: 1693225566
    Saída: 28/Aug/2023 12:26:06
*/

public class ConversaoTempo {


        public static void main(String[] args) throws ParseException {
            int entrada = 1693225566;
            TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");

            SimpleDateFormat originalFormat = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss");
            originalFormat.setTimeZone(utcTimeZone);
            Date data = new Date((long) entrada * 1000);
            String saidaData = originalFormat.format(data);
            System.out.println(saidaData);
        }
    }


