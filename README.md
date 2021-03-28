# Api Product

![](https://www.redspark.io/wp-content/uploads/2020/03/android.png)

![](https://img.shields.io/badge/android-studio-brightgreen)  
![](https://img.shields.io/badge/android-5.1-brightgreen)

Esse projeto é uma API de Produtos realizada através de mentoria  
juntamente com a Everis e Digital Innovation Onde cujo objetivo foi  
contruir uma API de produtos que busca informações de um endereço Web  
(https://uniqueandrocode.000webhostapp.com/hiren/androidtutorial/mycart/getdata.php)  
que é uma lista de JSON com as seguintes informações:

- Nome
- Preço
- Imagem


Com o retorno desse JSON consumimos essa informações em uma Recycler View.

Foram criadas permissões de acesso a internet no AndroidManifest, um  
model Product, que é Data Class, pois faz o get e o set automaticamente  
 composto  por nome, imagem e preço e que é responsável pelo mapeamento de retorno da API.

Configuramos a chamada da API com o Retrofit, uma das bibliotecas mais  
utilizados no Android.


Para rodar a aplicação é necessário cloná-lo do GitHub e ter o  
Android Studio instalado.

Para mais informações de onde baixar e como instalar o Android Studio  
acesse:


https://developer.android.com/studio?hl=pt-br


Para rodar a API você precisa ter um dispositivo virtual no AVD Manager.
Por padrão no Android Studio temos um modelo de dispositivo  
pré-definida chamada Pixel 3A, porém você poderá criar outros  
exemplos de celulares e salvá-los para posterior uso.

Para mais informações de como criar um dispositivo virtual acesse o  
link da documentação Android abaixo :

https://developer.android.com/studio/run/emulator?hl=pt-br

Você poderá executar a API em um dispositivo físico, basta conectá-lo  
via usb e seguir os procedimentos que contam no link abaixo:

https://developer.android.com/studio/run/device?hl=pt-br

Após execução aparecerá na tela do dispositivo as seguintes informações:
