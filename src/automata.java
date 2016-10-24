class automata {
    static boolean imparesCerosUnos(String cadena){
        boolean isValid = false;
        int status = 0;
        char c;

        for (int i = 0; i < cadena.length(); i++){
            c = cadena.charAt(i);
            if (status == 0 && c == '1') {
                status = 1;
            }
            else if(status == 0 && c == '0') {
                status = 2;
            }
            else if (status == 1 && c == '0') {
                status = 3;
            }
            else if(status == 1 && c == '1'){
                status = 0;
            }
            else if(status == 2 && c == '0'){
                    status = 0;
            }
            else if (status == 2 && c == '1'){
                status = 3;
            }
            else if(status == 3 && c == '0'){
                    status = 1;
            }
            else if (status == 3 && c == '1'){
                status = 2;
            }
        }
        if (status == 3)
            isValid = true;

        return  isValid;
    }
}
