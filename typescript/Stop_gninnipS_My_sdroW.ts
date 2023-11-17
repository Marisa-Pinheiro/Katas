// Kata "top gninnipS My sdroW!"
// By: xDranik on Codewars
// Ranking: 6kyu

export function spinWords(words: string): string {
   return words.split(" ").map((word)=> 
    word.length >= 5? word.split("").reverse().join(""):word).join(" ");
}
