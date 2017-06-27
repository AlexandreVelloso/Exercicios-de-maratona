import java.util.Scanner;

class Ponto{

  public double x, y;

  public Ponto( int x, int y ){
    this.x = x*1.0;
    this.y = y*1.0;
  }

  public Ponto( double x, double y ){
    this.x = x;
    this.y = y;
  }

  public String toString( ){
    return "("+this.x+","+this.y+")";
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

      if( ponto1.y < ponto2.y ){
        area1 = lado*pontoMedio;
        area2 = (altura-pontoMedio) * lado;
      }else{
        area1 = (altura-pontoMedio) * lado;
        area2 = lado*pontoMedio;
      }

    }else if( ponto1.y == ponto2.y ){
      double pontoMedio = ( ponto1.x + ponto2.x )/2.0;

      if( ponto1.x < ponto2.x ){
        area1 = altura*pontoMedio;
        area2 = (lado-pontoMedio) * altura;

      }else{
        area1 = (lado-pontoMedio) * altura;
        area2 = altura*pontoMedio;
      }

    }else{

      area1 = area2 = 0;

      Ponto pontoMedio = new Ponto( (ponto1.x + ponto2.x)/2.0 , (ponto1.y + ponto2.y)/2.0 );

      // estou tracando uma reta ligando os 2 pontos em que estao as pessoas na piscina
      // depois eu acho a equacao da reta perpendicular a essa tracada

      // coeficiente angular da reta perpendicular
      double a = -(ponto2.x - ponto1.x)/(ponto2.y - ponto1.y );
      // constante da reta perpendicular, b = y+ax
      double b = pontoMedio.y + (a*pontoMedio.x)*-1.0;


      // ponto em que a reta encosta no lado direito da piscina
      // y = ax+b -> x = lado
      double pontoDireita = (a*lado+b);
      double pontoEsquerda = -1;

      // se a reta e' decrescente
      if( a < 0 ){

        if( pontoDireita > 0 ){
          // ponto em que a reta encosta no lado esquerdo da piscina
          // y = ax+b -> x = 0
          pontoEsquerda = ( b );
        }else{

          // ***
          // ***
          // analisar essa parte
          // ***
          // ***

          // se o pontoDireita for <= 0 entao a reta nao encosta no lado direito da piscina
          // e devo calcular o ponto em que ela encosta no eixo X
          // ax+b = 0
          // x = -b/a
          pontoDireita = (b*1.0)/(a);

          // e o ponto esquerda e' calculado
          // ax+b = altura
          // x = ( altura-b )/a,
          pontoEsquerda = (altura-b)/a;
        }

        // integral de f(x) = -ax+b -> -(ax^2)/2 + bx
        // para saber a area1 eu tenho que calcular a integral definida de x = 0 ate x = lado
        area1 = ( (a*4*4)/2.0 + b*4 );
      }else{



      }

      System.out.println( pontoDireita );
      System.out.println( pontoEsquerda );
    }

    System.out.printf( "Area1: %f Area2: %f\n",area1, area2 );
    System.out.printf( "Area Total: %f\n",areaTotal);
    System.out.printf( "Porcentagem1: %f Porcentagem2: %f\n", (area1/areaTotal), (1-(area1/areaTotal)) );

  }// fim main
}
