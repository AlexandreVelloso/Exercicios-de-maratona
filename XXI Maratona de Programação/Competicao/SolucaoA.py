if __name__ == "__main__":
    A,B,C,D = map( int, input().split() )
    
    dif1 = abs( (A+B) - (C+D) )
    dif2 = abs( (A+C) - (B+D) )
    dif3 = abs( (A+D) - (C+B) )

    print( min( dif1, min( dif2, dif3 ) ) )
    
