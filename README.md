## Instruções

Na linha 51 do código é instaciada uma atividade com valor de descrição igual a null (sendo que descrição é tipo String). Execute o código e observe que não surgirá erro de compilação. Entretanto, descomente a linha 54 e observe o erro de compilação fornecido. Sua primeira missão aqui é corrigir o código para que esse erro não ocorra.

Perceba que cada atividade possui sua data de realização, que pode ser null. As datas são estruturadas com dia e mes, que também podem ser nulos. Escreva o código da função listarTituloEMes que deve imprimir na tela o título da ativadade e o mês em que deve ser realizada. Note que o Kotlin irá indicar erro ao tentar acessar as propriedades da data. Faça uso das Safe Calls.

Observe que, ao exibir as atividades cadastradas, algumas possuem o valor ‘null’ em alguns campos. Crie uma mensagem padrão para esses casos, como “Campo não informado”. Dica: use o operador Elvis

Implemente o método chamado listarAtividadeSemData() de forma que imprima na tela somente as atividades que tenham tanto o dia quanto o mês com valores nulos. Utilize um if statement para verificar os valores de dia e mês. Será necessário utilizar safe calls nesta verificação. Na sequência instancie uma atividade que receba o valor null no parâmetro data. São instâncias neste formato que devem ser listadas por esse método.