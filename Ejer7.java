import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Ejer7 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String datos [] = leer.nextLine().split(" ");
		String fecha [] = datos[0].split("/");
		int x=diaSemana(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
		if(Integer.parseInt(datos[1])%2==0 )
		{
			if(x==3 || x==5)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
		else
		{
			if(x==2 || x==4 || x==6)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
		
		
	}
	public static int diaSemana (int dia, int mes, int ano)
    {
        TimeZone timezone = TimeZone.getDefault();
        Calendar calendar = new GregorianCalendar(timezone);
        calendar.set(ano, mes-1, dia);
        int nD=calendar.get(Calendar.DAY_OF_WEEK);
        return nD;
    }

}
