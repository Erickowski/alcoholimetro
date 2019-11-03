void setup() {
  Serial.begin(9600);
}

void loop() {
  int valor = analogRead(A0); //Lemos la salida analógica  del MQ
  float conversion = ( (float) valor * 2) / 1536;
  Serial.println(conversion);
  delay(2000);
}
