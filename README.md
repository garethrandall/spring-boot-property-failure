This test shows Spring fail to substitute a property properly.

In rabbitmq-context.xml, this line:
<rabbit:connection-factory id="rabbitmqConnectionFactory" addresses="${rabbit.host:localhost}:5672"/>

Expected result:
addresses property ends up as "localhost:5672"

Actual result:

"localhost}:5672"

