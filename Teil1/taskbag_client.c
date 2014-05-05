/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "taskbag.h"


void
taskbagservice_1(char *host)
{
	CLIENT *clnt;
	char * *result_1;
	Task  puttask_1_arg;
	char * *result_2;
	char * gettask_1_arg;
	char * *result_3;
	char * readtask_1_arg;

#ifndef	DEBUG
	clnt = clnt_create (host, TaskBagService, ONE, "udp");
	if (clnt == NULL) {
		clnt_pcreateerror (host);
		exit (1);
	}
#endif	/* DEBUG */

	result_1 = puttask_1(&puttask_1_arg, clnt);
	if (result_1 == (char **) NULL) {
		clnt_perror (clnt, "call failed");
	}
	result_2 = gettask_1(&gettask_1_arg, clnt);
	if (result_2 == (char **) NULL) {
		clnt_perror (clnt, "call failed");
	}
	result_3 = readtask_1(&readtask_1_arg, clnt);
	if (result_3 == (char **) NULL) {
		clnt_perror (clnt, "call failed");
	}
#ifndef	DEBUG
	clnt_destroy (clnt);
#endif	 /* DEBUG */
}


int
main (int argc, char *argv[])
{
	char *host;

	if (argc < 2) {
		printf ("usage: %s server_host\n", argv[0]);
		exit (1);
	}
	host = argv[1];
	taskbagservice_1 (host);
exit (0);
}
