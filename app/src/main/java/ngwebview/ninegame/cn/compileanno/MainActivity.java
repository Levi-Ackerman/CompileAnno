package ngwebview.ninegame.cn.compileanno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.MyAnno;

public class MainActivity extends AppCompatActivity {

    @MyAnno("onCreate")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
