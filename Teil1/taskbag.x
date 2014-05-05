struct Task{
	int id;
	string type<50>;
	string descr<50>;
	int done;
};

program TaskBagService {
	version ONE {
		string putTask(Task * t) = 1;
		string getTask(string type<50>) = 2;
		string readTask(string type<50>) = 3;
	} = 1;
} = 1337;
