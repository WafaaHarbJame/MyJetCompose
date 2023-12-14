package com.example.myjetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTextField("this text Field")
            //ImageCard(painter = painterResource(id = R.drawable.image1), title = "this image")
//            MyJetComposeTheme {
//                Surface(modifier = Modifier.fillMaxSize()) {
//                    MessageCard(com.example.myjetcompose.classess.Message("Android","JetCompose"))
//
//                }

        }
//            MyJetComposeTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
    }
}


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyJetComposeTheme {
//        Greeting("Android")
//    }
//
//}

@Composable
fun MessageCard(mes: com.example.myjetcompose.classess.Message) {

//    Column {
//        Text(text = "Hello Author  ${mes.author}!")
//        Text(text = "Content  ${mes.body}!")
//    }
    Row(
        modifier = Modifier
            .padding(all = 4.dp)
            .fillMaxWidth()
    ) {

        Image(
            painter = painterResource(id = R.drawable.image2),
            contentDescription = "TEST",
            modifier = Modifier
                .size(40.dp) // Adjust size as needed
                .clip(CircleShape) // Clip as a circle if desired
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(text = mes.author)
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = mes.body)
        }

    }


}

@Composable
fun ImageCard(painter: Painter, title: String) {

    Card(border = BorderStroke(2.dp, color = Color.Black)) {
        Box(
            modifier = Modifier.background(Color(R.color.white))


        ) {
            Column(
                modifier =
                Modifier
                    .width(100.dp)
                    .height(100.dp)

            ) {
                Image(painter = painter, contentDescription = title)


                Box(
                    modifier = Modifier
                        .background(
                            brush = Brush.verticalGradient(
                                listOf(Color.White, Color.Black)
                            )
                        )
                        .width(100.dp)

                ) {
                    Text(
                        text = title,
                        modifier = Modifier.padding(8.dp),
                        color = Color(R.color.white),
                        fontSize = 12.sp
                    )
                }

            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(value1: String) {
    val changedValue: String = mutableSetOf<String>().toString()
    TextField(value = value1, onValueChange = {
    }, modifier = Modifier.padding(10.dp))

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyOutlinedTextField(value1: String) {
    OutlinedTextField(
        value = value1,
        shape = TextFieldDefaults.outlinedShape,
        label = {


        },
        onValueChange = {
        },
        modifier = Modifier
            .padding(10.dp)
            .border(width = 2.dp, color = Color.Blue, shape = RectangleShape)
    )

}


@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxSize()
            .padding(20.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.text_field))
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = stringResource(id = R.string.text_field))
        Text(text = stringResource(id = R.string.text_field))
        Text(text = stringResource(id = R.string.text_field))
    }

}

@Preview
@Composable
fun PreviewMessageCard() {
    Greeting()
//    MyJetComposeTheme {
//        Surface() {
//            MessageCard(mes = com.example.myjetcompose.classess.Message("Wafaa ", "Jame"))
//
//        }
//    }

    //ImageCard(painter = painterResource(id = R.drawable.image1), title = "this image")

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.Green), Arrangement.Center, Alignment.CenterHorizontally
//    ) {
//        MyOutlinedTextField(stringResource(id = R.string.outline_field))
//        MyTextField(stringResource(id = R.string.text_field))
//
//    }


}



