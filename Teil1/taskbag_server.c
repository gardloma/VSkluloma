/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "taskbag.h"
#include <iostream>
#include <vector>
#include <string>

using namespace std;

static vector<Task*> taskbag;

char **
puttask_1_svc(Task *argp, struct svc_req *rqstp)
{
	static char * result = "puttask_1_svc";
	
	/*
	 * insert server code here
	 */
	Task *tmp = new Task;
	tmp->id = taskbag.size();
	tmp->descr = new char[strlen(argp->descr)];
	strcpy(tmp->descr,argp->descr);
	tmp->type = new char[strlen(argp->type)];
	strcpy(tmp->type, argp->type);
	tmp->done = 0;
	
	cout << "Put: " << endl;
	cout << "ID = " << tmp->id << endl;
	printf("Type =  %s \n", argp->type);
	printf("Description =  %s \n", argp->descr);
	
	taskbag.push_back(tmp);
	
	return &result;
}

int find(vector<Task*> bag, char *type){
  printf("Search =  %s \n", type);
  for(int i = 0; i < bag.size(); i++){
    printf("Have = %s\n", bag[i]->type);
    if((!strcmp(bag[i]->type, type)))
      if(bag[i]->done == 0){
	cout << i << endl;
	return i;
      }
  }
  return -1;
}

char **
gettask_1_svc(char **argp, struct svc_req *rqstp)
{
	static char * result  = (char *) NULL;
	printf("result =  %s \n", *argp);
	/*
	 * insert server code here
	 */
	int place = find(taskbag, *argp);
	if(place != -1){
	  result = taskbag[place]->descr;
	  taskbag[place]->done = 1;
	}
	return &result;
}

char **
readtask_1_svc(char **argp, struct svc_req *rqstp)
{
	static char * result = (char *) NULL;
	//printf("result =  %s \n", *argp);

	/*
	 * insert server code here
	 */
	int place = find(taskbag, *argp);
	if(place != -1)
	  result = (taskbag[place]->descr);
	else
	  result = "Not Found!";	
	
	return &result;
}
