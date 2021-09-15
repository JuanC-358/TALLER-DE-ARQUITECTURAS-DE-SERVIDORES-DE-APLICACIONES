var webapp = (function () {
    function cambio() {
        if(document.getElementById("kri").style.display === "none"){
            document.getElementById("app").textContent = "Acabas de matar a Krilin";
            document.getElementById("kri").style = "display : block; margin: 0 auto";
        }
        else {
            document.getElementById("app").textContent = "Krilin ha revivido con la ayuda de las esferas del dragon";
            document.getElementById("kri").style = "display : none; margin: 0 auto";
        }
    }
    return {
        cambio:cambio
    };
})();