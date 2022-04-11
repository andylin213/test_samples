package main
import (
	"github.com/xxx/testlib"
	"net/http"
)


func source() string {
	return ""
}

func spread(x string) (string, error) {

}

func sink(x string) {

}

func ignore() {
	x := source()
	sink(x)
}

func test(x string) {
	sink(x)
}

func entry(w http.ResponseWriter, r *http.Request) {
	a := source()
	aa, _ := spread(a)
	sink(aa)

	b := testlib.source()
	bb, _ := testlib.spread(a)
	testlib.sink(a)

	ignore()

	test("1")
}

//func YourHandler(w http.ResponseWriter, r *http.Request) {
//	vars := r.URL.Query()
//	input := vars["name"][0]
//	cmd1 := exec.Command("cmd", "/c", input)
//	out, err := cmd1.CombinedOutput()
//	fmt.Println(out, err)
//	w.Write([]byte(a2))
//}
//func main() {
//	r := mux.NewRouter()
//	// Routes consist of a path and a handler function.
//	r.HandleFunc("/", YourHandler)
//	// Bind to a port and pass our router in
//	log.Fatal(http.ListenAndServe(":8000", r))
//}