package br.senai.sp.jandira.ayancare.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ayancare.R
import br.senai.sp.jandira.ayancare.Wave

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RecuperarSenha2() {
    var emailState = rememberSaveable {
        mutableStateOf("")
    }

    var passwordState = rememberSaveable {
        mutableStateOf("")
    }
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            modifier = Modifier
                .height(40.dp)
                .width(120.dp),

            shape = RoundedCornerShape(
                bottomStart = 32.dp
            )
        ) {

            // form
            Column(
                modifier = Modifier
                    .background(Color(248, 240, 236))
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.oi),
                    contentDescription ="",
                    modifier= Modifier.size(width = 95.dp, height = 150.dp)

                )
                Text(
                    text = stringResource(id = R.string.password_recovery),
                    modifier = Modifier.padding(start = 17.dp),
                    fontSize = 32.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.W700,


                    )
                Text(
                    text = stringResource(id = R.string.information),
                    modifier = Modifier.padding(start = 70.dp, end = 70.dp),
                    fontSize = 17.sp,
                    color = Color(160, 156, 156)
                )
                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 50.dp, end = 40.dp, top = 100.dp),
                    label = {
                        Text(
                            text = stringResource(id = R.string.new_password)

                        )
                    },
                    shape = RoundedCornerShape(18.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = colorResource(
                            id = R.color.white
                        )

                    )
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 170.dp)
                        .height(40.dp)
                        .width(190.dp),
                    shape = RoundedCornerShape(
                        topStart = 10.dp,
                        topEnd = 10.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    ),
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.dark_purple)),


                    ) {
                    Text(
                        text = stringResource(id = R.string.send_button),
                        modifier = Modifier.padding(5.dp),
                        fontSize = 12.sp,
                        color = Color.White

                    )

                }
                Wave()
            }
        }

    }
}