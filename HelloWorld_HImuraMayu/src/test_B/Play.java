package test_B;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Play {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	// キャラクター抽出
		// パターン①：ランダムに1人を出力する
		String [] characters ={
				"皇后崎 - ツンデレ系",
				"名都 - ツンデレ系",
				"愛 - 純粋バカ系",
				"四季 - 純粋バカ系",
				"淀川 - 無表情系",
				"無陀野 - 無表情系",
				"糸師 - クールビューティー"
		};
		
		Random rand = new Random();
        int index = rand.nextInt(characters.length);  // 0〜7の乱数
        System.out.println("今日のキャラは…");
        System.out.println(characters[index]);
        
        
        // パターン②：for文で順に出力する
        String[]types = {"ツンデレ系","純粋バカ系","無表情系","完璧系"};
        
        String[][]names= {
        	{"皇后崎","百谷"},
        	{"愛","四季"},
        	{"淀川","無陀野"},
        	{"高岡"},
        };
        
        for (int i = 0; i < types.length; i++) {
            System.out.println(types[i] );
            for (String name : names[i]) {
                System.out.println("・" + name);
            }
            System.out.println();  // 空行
        }
        
        // 配列の宣言
        int numbers[];
        
        // 配列の作成（長さ５の配列を確保）
        numbers = new int[5];
        // 5個の要素を持つ配列を作成
        int[] numbers2= new int[5];
        // 5つの要素を持つ配列を作成し、値を代入
        int[] scores= {50,60,30,90,40};
        // 配列の要素の上書き
        scores[1]=100; // 2番目の要素（インデックス1）を変更
        System.out.println(scores[1]);
        scores[2]=80;
        System.out.println(scores[2]);
        System.out.println(scores[0]);
        
        
        // 配列の要素数取得= 配列名.length
        int[] scores1={100,20,59,20,60,29};
        System.out.println("配列の要素数は："+ scores1.length);
        
        
    // 複数の配列同士の結合
        // ①Arrays.copyOf() を使う
        // Arrays.copyOf() と System.arraycopy() を使って配列を結合
        
        int[] array1= {1,2,3};
        int[] array2= {4,5,6};
        // array2の要素をmergedArrayに追加
        int mergedArray[] = Arrays.copyOf(array1,array1.length + array2.length);
        System.arraycopy(array2,0,mergedArray,array1.length,array2.length);
        System.out.println(Arrays.toString(mergedArray));
        
        
        // ②Stream を使う（Java 8 以上）
        //Stream を使うとシンプルに結合できる！（Java 8 以上）
        
        
        // mapとlist
  
        Map scores2=new HashMap<>();
       // データの追加（キー, 値）
        scores2.put("sae",9);
        scores2.put("rin",10);
        scores2.put("sdo",40);
        scores2.put("chigiri",44);
       // キーを使って値を取得
        System.out.println(scores2.get("sdo"));
       // キーの存在を確認
        System.out.println(scores2.containsKey("sae"));
       // 要素の削除
        scores2.remove("sdo");
        System.out.println(scores2.containsKey("sdo"));
       // Mapのサイズ
        System.out.println(scores2.size());
       // Mapの全要素を表示
        
        String str ="A.BC..D";
        String[] split1 = str.split(".");
        System.out.println(Arrays.toString(split1));
        String[] split2= str.split("\\."); // → [] ※長さ0の文字列
        System.out.println(Arrays.toString(split2));
      


        

       
        
       
	}

}
