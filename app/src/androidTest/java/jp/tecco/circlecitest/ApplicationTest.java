package jp.tecco.circlecitest;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

    private Context mContext;

    @Before
    public void setUp() throws Exception {
        // Contextを取得
        mContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
    }

    @Test
    public void add() {
        //assertThat(Calc.add(3, 5), is(8));
    }

    @Test
    public void context() {
        // Contextを使ったテスト
        assertThat(mContext.getString(R.string.app_name), is("CircleCITest2"));
    }
}