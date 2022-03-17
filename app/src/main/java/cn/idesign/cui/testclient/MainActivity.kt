package cn.idesign.cui.testclient

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cn.idesign.cui.testclient.banner.BannerTest
import cn.idesign.cui.testclient.ui.theme.CUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CUITheme {
                Surface {
                       BannerTest()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CUITheme {
        Surface(
            modifier = Modifier.fillMaxSize().background(color =  MaterialTheme.colors.background),
            color = MaterialTheme.colors.background
        ) {

                BannerTest()
        }
    }
}