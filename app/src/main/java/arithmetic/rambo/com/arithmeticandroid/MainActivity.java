package arithmetic.rambo.com.arithmeticandroid;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dichotomizingSearch();
    }

    //二分法实例子
    int datas[] = new int[]{6, 7, 10, 17, 28, 40, 58, 62, 71, 99};
    private int dichotomizingSearch() {
        int  startIndex=0;
        int  endIndex=datas.length-1;
        int words=6;

        while (startIndex<=endIndex){
            int  middleIndex=(startIndex+endIndex)/2;
            if(words==datas[middleIndex]){//如果中间就找到了
                return middleIndex;
            }else if(words<datas[middleIndex]){
                endIndex=middleIndex-1;
            }else{
                startIndex=middleIndex+1;
            }
        }
        return  -1;
    }


}
