package ch07;
import java.util.Arrays;
import java.util.Random;

public class Ex23 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] card = new int[4][13]; //4個人每人13張牌
		int[] card_order = new int[52]; //將52張牌，從小排到大編號成0到51
		char[] color = new char[] {'♠','♥','♦','♣'}; // 撲克牌的花色
		// 撲克牌的點數
		String[] point = new String[]
				          {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		int card_num = 52; //目前尚未發出的撲克牌之張數
		int play_card;     //代表每次所發的牌，是位於所有撲克牌中的第play_card張牌
		int i,j;
		/*撲克牌的排列順序:
		            ♠A ♠A ♦A ♣A ♠2 ♠2 ♦2 ♣2 ... ♠K ♠K ♦K ♣K
		設定排列順序   0  1  2  3  4  5  6  7  ... 48 49 50 51		*/  		
		for(i = 0;i < 52;i++)
			card_order[i] = i;
		
		//1人1張牌輪流發，1輪4張共發13輪
		for(j = 0;j < 13;j++) {
			for(i = 0;i < 4;i++) {	
				//用亂數模擬發牌，取得"排列順序為play_card"的撲克牌
				play_card = rnd.nextInt(card_num); 
				
				//將排列順序為play_card的的撲克牌(card_order[play_card])，
				//指定給第i個人的第j張的撲克牌
				card[i][j] = card_order[play_card]; 
				
				//將最後的一張牌的排列順序(card_order[card_num - 1])，
				//指定給原先排列順序為play_card的牌(card_order[play_card])
				//這樣亂數產生器就不會再產生原來排列順序為play_card的牌				
				card_order[play_card] = card_order[card_num - 1];
				
				//發牌之後，尚未發出的撲克牌張數,就少一張
				card_num--;
			}
		}
		for(i = 0;i < 4;i++) {
			System.out.printf("第%d位玩家手牌：\n",i + 1);
			Arrays.sort(card[i]); //將第i位玩家手中的牌，從小排到大
			for(j = 0;j < 13;j++) {
				//將第i個人的第j張牌的排列順序(card[i][j])，
				//轉成對應的花色(color[card[i][j] % 4])				
				System.out.printf("%c",color[card[i][j] % 4]);
				
				//將第i個人的第j張牌的排列順序(card[i][j])，
				//轉成對應的點數(point[card[i][j] / 4])
				System.out.printf("%-4s",point[card[i][j] / 4]);					
			}
			System.out.println();
		}
	}
}