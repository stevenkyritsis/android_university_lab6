package com.codepath.nytimes.ui.books

import com.codepath.nytimes.models.BestSellerBook
import com.codepath.nytimes.ui.books.OnListFragmentInteractionListener
import androidx.recyclerview.widget.RecyclerView
import com.codepath.nytimes.ui.books.BestSellerBooksRecyclerViewAdapter.BookViewHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.codepath.nytimes.R
import com.bumptech.glide.Glide
import android.widget.TextView

/**
 * [RecyclerView.Adapter] that can display a [BestSellerBook] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 */
class BestSellerBooksRecyclerViewAdapter(private val books: List<BestSellerBook>, private val mListener: OnListFragmentInteractionListener?) : RecyclerView.Adapter<BookViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_best_seller_book, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val bestSellerBook = books[position]
        holder.mItem = bestSellerBook
        holder.mBookTitle.text = bestSellerBook.title
        holder.mBookAuthor.text = bestSellerBook.author
        holder.mBookRanking.text = String.format("%d", bestSellerBook.rank)
        holder.mBookDescription.text = bestSellerBook.description
        Glide.with(holder.mView)
                .load(bestSellerBook.bookImageUrl)
                .centerInside()
                .into(holder.mBookImage)
        holder.mView.setOnClickListener { mListener?.onItemClick(holder.mItem) }
    }

    override fun getItemCount(): Int {
        return books.size
    }

    inner class BookViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mBookTitle: TextView = mView.findViewById<View>(R.id.book_title) as TextView
        val mBookImage: ImageView = mView.findViewById<View>(R.id.book_image) as ImageView
        val mBookAuthor: TextView = mView.findViewById<View>(R.id.book_author) as TextView
        val mBookRanking: TextView = mView.findViewById<View>(R.id.ranking) as TextView
        val mBookDescription: TextView = mView.findViewById<View>(R.id.book_description) as TextView
        var mItem: BestSellerBook? = null
        override fun toString(): String {
            return mBookTitle.toString() + " '" + mBookAuthor.text + "'"
        }
    }
}