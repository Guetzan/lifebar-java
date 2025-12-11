## Lifebar CLI em Java
Uma reimplementação com algumas melhorias de um código simples que fiz em C:<br>
https://github.com/Guetzan/text-life-bar

Consiste em imprimir uma barra de vida de tamanho fixo, baseada na vida de um "jogador".

Então se um jogador tiver uma vida total de 2000, mas atualmente estiver apenas com 857 pontos de vida, o seguinte será impresso:

<pre>
857/2000
[■ ■ ■ ■             ]
</pre>
Apesar do jogador ter 857 pontos de vida completos, apenas quatro quadrados foram impressos, pois a variável barSize, responsável por limitar a quantidade desses quadrados, foi definida com um valor de 10, sendo assim, sempre será impresso no máximo 10 "quadrados de vida", independente da vida máxima do jogador. Isso porque, 857 é aproximadamente 4/10 de 2000.

<strong>obs: planejo refatorar esse código assim que aprender sobre OOP</strong>