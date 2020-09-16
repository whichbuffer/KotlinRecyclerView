package com.whichbuffer.kotlinrecyclerview

import com.whichbuffer.kotlinrecyclerview.models.BlogPost

class DataSource{
    companion object{
        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Smiles are everywhere",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                    "https://photo-cdn.icons8.com/assets/previews/805/fe5f6658-1489-472f-ac9a-89dbda31476a.jpg",
                    "Sally"
                )
            )
            list.add(
                BlogPost(
                    "Traditional easter decoration\n",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                    "https://photo-cdn.icons8.com/assets/previews/684/1b861440-70bc-494e-8050-685adb14ef4b1x.jpg",
                    "mitch"
                )
            )

            list.add(
                BlogPost(
                    "Relaxing bengal cat\n",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                    "https://photo-cdn.icons8.com/assets/previews/625/8a0e287e-6c30-4325-9d29-3ae89fce1936.jpg",
                    "John"
                )
            )
            list.add(
                BlogPost(
                    "A bengal cat being kissed by its owner",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                    "https://photo-cdn.icons8.com/assets/previews/522/5dfd7048-d466-4e45-9bc1-824977b40dfe.jpg",
                    "Steven"
                )
            )
            list.add(
                BlogPost(
                    "What a nice grey animal cat\n",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                    "https://photo-cdn.icons8.com/assets/previews/893/e3a8aba0-42fe-4e29-a58e-092acb2e47fb1x.jpg",
                    "Richelle"
                )
            )

            return list
        }
    }
}