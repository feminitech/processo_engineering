# Como rodar o projeto

Pré-requisito: ter o [JDK](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html), o [Eclipse](https://www.eclipse.org/downloads/) instalados, e o [ChromeDriver](https://chromedriver.chromium.org/downloads) baixado e extraído.

ps.: *o ChromeDriver deve ser baixado na mesma versão do Chrome ou a versão mais próxima.*

 1. Aqui no github clique em **Code**
 2. Então em **Download zip**
 3. Um arquivo zip deve ser baixado
 4. Após extrair o arquivo na sua pasta de preferência
 5. Abra o Eclipse
 6. Clique em **File**
 7. Então clique em **Open Projects from File System...**
 8. A janela de importação deve ser aberta
 9. Então clique em **Directory...**
 10. Selecione a pasta do projeto no diretório onde ela foi extraída
 11. Clique em **Finish**
 12. com o projeto aberto no eclipse
 13. clique em **src/main/java**
 14. então clique no pacote **engineering**
 15. E clique na classe **processoSeletivo.java**
 16. altere o **System.setProperty("webdriver.chrome.driver", "/home/nayara/selenium_drivers/chromedriver");** para o caminho onde o ChromeDriver foi extraído
 17. Agora clique em **run**
 18. Pronto o teste vai rodar :)

Utilizei o padrão de projeto **Page Objects** a fim de facilitar a escrita, leitura e  manutenções dos testes.