import axios from "axios";

const API_URL ="http://localhost:8080";


class ProductService{

    saveProduct(Product){
        return axios.post(API_URL+"/saveProduct",Product);
    }

    getAllProduct(){
        return axios.get(API_URL+"/");
    }
    getProductById(id){
        return axios.get(API_URL+"/"+id);
    }

    deletePrduct(id){
        return axios.get(API_URL+"/deleteProduct"+id)
    }
    editProduct(Product){
        return axios.get(API_URL+"/"+Product.id,Product)
        
    }

}
export default new ProductService;