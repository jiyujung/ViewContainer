package kr.hs.emirim.s2019w39.viewcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivityTest extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpecSolar = tabHost.newTabSpec("Solar").setIndicator("솔라");
        tabSpecSolar.setContent(R.id.linear_solar);
        tabHost.addTab(tabSpecSolar);

        TabHost.TabSpec tabSpecMoonstar = tabHost.newTabSpec("Moonstar").setIndicator("문별");
        tabSpecMoonstar.setContent(R.id.linear_moonstar);
        tabHost.addTab(tabSpecMoonstar);

        TabHost.TabSpec tabSpecWheein = tabHost.newTabSpec("Wheein").setIndicator("휘인");
        tabSpecWheein.setContent(R.id.linear_wheein);
        tabHost.addTab(tabSpecWheein);

        tabHost.setCurrentTab(0);
    }
}