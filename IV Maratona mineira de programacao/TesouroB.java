import java.util.Scanner;

class Ponto{

  public int x, y;

  public Ponto( int x, int y ){
    this.x = x;
    this.y = y;
  }
}

public class Tesouro{

  public static void main(String [] args){

    Scanner sc = new Scanner ( System.in );

    int lado = sc.nextInt();
    int altura = sc.nextInt();
    Ponto ponto1 = new Ponto( sc.nextInt(), sc.nextInt() );
    Ponto ponto2 = new Ponto( sc.nextInt(), sc.nextInt() );

    // *** fim ler entrada ***

    double area1, area2;
    double areaTotal = lado*altura;

    if( ponto1.x == ponto2.x ){
      double pontoMedio = ( ponto1.y + ponto2.y )/2.0;
      area1 = lado * pontoMedio;
      area2 = lado * pontoMedio;

    }else if( ponto1.y == ponto2.y ){
      double pontoMedio = ( ponto1.x + ponto2.x )/2.0;
      area1 = altura * pontoMedio;
      area2 = altura * pontoMedio;

    }else{
      area1 = area2 = 0;
    }

    System.out.printf( "Area1: %f Area2: %f\n",area1,area2 );
    System.out.printf( "Area Total: %f\n",areaTotal);
    System.out.printf( "Porcentagem1: %f Porcentagem2: %f\n", (area1/areaTotal), (area2/areaTotal) );

  }// fim main
}
