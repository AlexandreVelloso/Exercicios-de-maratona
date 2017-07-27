if __name__ == "__main__":
    numPosts, numComands, nearStation = map( int, input().split() )

    # as estacoes terao o valor de 0 ate numPosts-1
    atualStation = 0
    # por isso devo subtrair um de nearStation
    nearStation -= 1

    # conta quantas vezes o robo passou pela estacao mais proxima
    count = 0

    # se o robo comecar em uma estacao proxima
    if( atualStation == nearStation ):
            count += 1

    # para cada comando, andar com o robo e verificar se ele chegou
    # na estacao mais proxima do desastre
    for command in list( input().split() ):
        atualStation = ( atualStation + int(command) ) % numPosts

        if( atualStation == nearStation ):
            count += 1
    # end for

    print( count )
# end main
