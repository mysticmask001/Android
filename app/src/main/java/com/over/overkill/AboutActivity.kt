package com.over.overkill

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.over.overkill.ui.theme.OverkillTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            About()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun About() {
    LazyColumn(
        modifier=Modifier
            .fillMaxSize()
    ) {

        item {
            Column (
                modifier = Modifier
                    .background(color = Color.DarkGray)
//          .fillMaxWidth()
//          .fillMaxHeight()
                    .fillMaxSize()
                    .padding(10.dp),

//        verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,


                ){

                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxWidth()
                        .height(40.dp)

                ) {

                    Text(text = "Feed")

                    Spacer(modifier = Modifier .width(12.dp))

                    Text(text = "Notifications")

                    Spacer(modifier = Modifier .width(12.dp) )

                    Text(text = "Profile")

                    Spacer(modifier = Modifier .width(12.dp))
                }

                Spacer(modifier = Modifier.height(150.dp))




                Text(text = "This is my app", fontSize = 20.sp, fontFamily = FontFamily.Cursive)

                Text(text = "This is dope", fontFamily = FontFamily.Monospace)

                val home = LocalContext.current
                Button(onClick = {

                    home.startActivity(Intent(home, MainActivity::class.java))



                },
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
//              shape = RectangleShape
//              shape = RoundedCornerShape(20.dp)
//            shape = CutCornerShape(percent = 10),
//
                    border = BorderStroke(2.dp, Color.Black),
//
////
//            colors = ButtonDefaults.outlinedButtonColors(Color.White),


                ) {

                    Text(text = "Home", color = Color.Blue)

                }



                val df = AnnotatedString("Home",
                    spanStyle = SpanStyle(Color.Red)
                )


                val ll = LocalContext.current
                ClickableText(text = df, onClick = {
                    ll.startActivity(Intent(ll, MainActivity::class.java))
                })


                val gg = LocalContext.current
                Text(text = "Click me",
                    modifier = Modifier
                        .clickable{
                            gg.startActivity(Intent(gg, MainActivity::class.java))
                        }

                )


            }
        }
    }

}


