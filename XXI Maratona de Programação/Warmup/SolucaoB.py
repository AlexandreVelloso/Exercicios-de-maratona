def haveRepeated( number ):

    # lista de digitos que ja apareceram na string
    digitos = list()

    for c in str( number ):
        # se um numero apareceu duas vezes
        if( c in digitos ):
            return True
        else:
            digitos.append( c )
    # end for

    return False

if __name__ == "__main__":
    inicio, fim = map( int, input().split() )

    count = 0

    for num in range( inicio, fim+1 ):
        if( haveRepeated( num ) == False ):
            count += 1
    # end for

    print( count )
