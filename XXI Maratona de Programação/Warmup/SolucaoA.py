if __name__ == "__main__":
    X = list( map( int, input().split() ) )
    Y = list( map( int, input().split() ) )

    compatible = True
    
    for pos in range( 5 ):
        if( X[pos] == Y[pos] ):
            compatible = False
            break
    # end for

    if( compatible ):
        print( "Y" )
    else:
        print( "N" )
