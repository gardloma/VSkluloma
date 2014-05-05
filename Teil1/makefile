# Makefile

SERVER_FILES	= taskbag_server.c taskbag_svc.c taskbag_xdr.c
CLIENT_FILES	= taskbag_client.c taskbag_clnt.c taskbag_xdr.c
CC	= g++
CFLAGS	= -g -ansi

Server:		$(SERVER_ FILES)
		$(CC) $(CFLAGS) $(SERVER_FILES) -o taskbag_server

Client:		$(CLIENT_ FILES)
		$(CC) $(CFLAGS) $(CLIENT_FILES) -o taskbag_client

RPC:		
		rpcgen -Ca taskbag.x
		
clean:		
		rm -f *.o *~ *.c *.h taskbag_server taskbag_client *.taskbag
