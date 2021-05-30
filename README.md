# SampleRMIinJava
Exemplo Simples de uso de uma RMI em sistemas distribuidos

Passo 1) Abra um prompt de comando e vá até a pasta bin do seu projeto criada pelo Eclipse, lá estarão os arquivos *.class 
obs: Se você não estiver usando uma IDE como por exemplo o Eclipse, você deverá executar o comando javac *.java  na pasta em que criou os arquivos .java

Passo 2) Antes de iniciar este passo, certifique-se de que a subpasta “bin” do seu JDK (o jdk instalado em sua máquina) esteja no path do seu sistema operacional como 
detalhado no passo 0. Depois de colocar a subpasta “bin” do seu JDK no path do seu Sistema Operacional, no prompt de comandos do seu Sistema Operacional, 
ir até o diretório no qual estão as classes compiladas e iniciar o registro do  RMI com o comando:
 start rmiregistry

Nesta etapa será aberta uma janela como a seguir, e nenhuma mensagem será exibida.
Não feche a esta janela, nem digite nada nela. Apenas volte para o prompt de comandos do seu Sistema Operacional.

Passo 3) Voltando ao prompt de comandos, na pasta bin, inicialize o servidor:
start java HelloServer

Será aberta uma janela indicando que o servidor foi inicializado com sucesso!

Não feche esta janela, nela serão mostradas as mensagens de execução no Servidor RMI

Passo 4) Abra um OUTRO PROMPT DE COMANDOS na bin do seu projeto, e inicie o cliente com o comando:
java HelloClient

Deixe esta janela e a anterior abertas para verificar as mensagens de comunicação do Cliente e Servidor do RMI.
