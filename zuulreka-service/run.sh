PORT=0
if [ ! -z "$1" ]; then
	PORT=$1
fi
	
echo "starting on port $PORT"
SERVER_PORT=${PORT} mvn spring-boot:run
