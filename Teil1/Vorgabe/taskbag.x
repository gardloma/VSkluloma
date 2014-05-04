struct echo_struct {
	string p1<50>;
	string p2<50>;
};

program ECHO_TEST {
	version ONE {
		string ECHO(echo_struct p) = 1;
	} = 1;
} = 1234567;
