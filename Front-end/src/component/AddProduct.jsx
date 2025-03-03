import React, { useState } from "react";

const AddProduct = () => {
const [product, setProduct] = useState({
    productName: String,
    description: String,
    price: String,
    status: String,
});


    return(
        <>
    <div className="container mt-3">
        <div className="row">


            <div className="col-md-6 offset-md-3"></div>
            <div className="card"></div>
            <div className="card-header fs-3 text-centre"></div>


            <div className="card-body">
                <form>
                    <div className="mb-3">
                        <label>Enter Product Name</label>
                        <input
                            type="text"
                            name="productName"
                            className="form-contro;" />

                    </div>
                    <div className="mb-3">
                        <label>Enter Discription</label>
                        <input
                            type="text"
                            name="productName"
                            className="form-contro;" />

                    </div>

                    <div className="mb-3">
                        <label>Enter Status</label>
                        <input
                            type="text"
                            name="status"
                            className="form-contro;" />

                    </div>
                    <button className="btn btn-primary col-md-12">Submit</button>

                </form>
            </div>

        </div>

    </div>
    </>
    )

}
export default AddProduct