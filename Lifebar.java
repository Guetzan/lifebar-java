/*fiz uma versão mais "flexível", que não limita os pontos máximos de vida em 100
dessa forma, ele sempre irá ter uma barra de tamanho fixo (dessa vez definido por variável), 
independente da quantidade total de vida do jogador.*/ 
public class Lifebar
{   
	public static void main(String[] args) {
        
        int playerLife = 2000;
        int playerCurrentLife = 857;
        
        System.out.println(playerCurrentLife + "/" + playerLife);
        //abre delimitador da barra
        System.out.print("[");
        
        int barSize = 10;
        int lifePointsPrinted = 0;

        //imprime um quadrado para cada (playerLife / barSize) pontos de vida completos
        for(int lifeCounter = 1; lifeCounter <= playerCurrentLife; lifeCounter++) {
            if((lifeCounter % (playerLife / barSize)) == 0) {
                System.out.print("■");
                lifePointsPrinted++;
                
                if(lifeCounter != playerCurrentLife) {
                    System.out.print(" ");
                }
            }
        }

        //evita que a barra fique vazia caso o jogador esteja com vida menor que (playerLife / barSize), mas não morto
        if(playerCurrentLife < (playerLife / barSize) && playerCurrentLife > 0) {
            System.out.print("■");
            lifePointsPrinted = 1;
        }

        //em caso do jogador estar com vida incompleta, irá preencher o resto da barra com espaços vazios
        if(playerCurrentLife < (playerLife - (playerLife / 10))) {
            int missingLifePoints = barSize - lifePointsPrinted;
    
            if(missingLifePoints > 0) {
                for(int emptySpaceCounter = 1; emptySpaceCounter <= missingLifePoints; emptySpaceCounter++) {
                    System.out.print("  ");
                }
            }
        }

        System.out.println("]");
	}
}