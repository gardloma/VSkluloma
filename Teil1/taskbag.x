class Task{
	int id;
	string type;
	string descr;
	int done;
}

program TaskBagService {
	version ONE {
		string putTask(string type, string descr) = 1;
		string getTask(string type) = 2;
		string readTask(string type) = 3;
	} = 1;
} = 1337;
