package vetor04;

import java.util.Arrays;

public class Vetor04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vet[] = {3,7,6,1,9,4,2};
		
		for(int v:vet) {
			System.out.print(v + " | ");
		}
		System.out.println("");
		int p = Arrays.binarySearch(vet, 1);//encontra o valor na posição do array
		System.out.println("Encontrei o valor na posição "+p);
	}

}
